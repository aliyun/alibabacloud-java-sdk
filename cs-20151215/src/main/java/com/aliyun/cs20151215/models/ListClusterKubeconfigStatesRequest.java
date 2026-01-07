// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterKubeconfigStatesRequest extends TeaModel {
    @NameInMap("cloudServiceKubeConfig")
    public Boolean cloudServiceKubeConfig;

    /**
     * <p>The page number.</p>
     * <ul>
     * <li>Valid values: ≥ 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 10 to 50.</li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListClusterKubeconfigStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterKubeconfigStatesRequest self = new ListClusterKubeconfigStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterKubeconfigStatesRequest setCloudServiceKubeConfig(Boolean cloudServiceKubeConfig) {
        this.cloudServiceKubeConfig = cloudServiceKubeConfig;
        return this;
    }
    public Boolean getCloudServiceKubeConfig() {
        return this.cloudServiceKubeConfig;
    }

    public ListClusterKubeconfigStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterKubeconfigStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
