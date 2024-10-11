// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>The state of the instance. Valid values: Running, Ready, Initializing, and Starting.</p>
     * 
     * <strong>example:</strong>
     * <p>1608533404</p>
     */
    @NameInMap("expiredTime")
    public String expiredTime;

    /**
     * <p>The name of the instance. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>GET /openapi/instances?name=test&amp;instanceId=abc&amp;page=1&amp;size=10</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("status")
    public String status;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ListInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstanceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
