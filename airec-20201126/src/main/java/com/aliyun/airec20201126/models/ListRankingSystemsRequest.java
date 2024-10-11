// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingSystemsRequest extends TeaModel {
    /**
     * <p>The name of the ranking service.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_DEPLOYED</p>
     */
    @NameInMap("deployStatus")
    public String deployStatus;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>service-a</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The state of the deployment. Valid values: NOT_DEPLOYED: The ranking service is not deployed. DEPLOY_SUCCESS: The ranking service is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListRankingSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRankingSystemsRequest self = new ListRankingSystemsRequest();
        return TeaModel.build(map, self);
    }

    public ListRankingSystemsRequest setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public ListRankingSystemsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRankingSystemsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRankingSystemsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
