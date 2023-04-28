// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterHealthCheckTaskRequest extends TeaModel {
    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListClusterHealthCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHealthCheckTaskRequest self = new ListClusterHealthCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterHealthCheckTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListClusterHealthCheckTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListClusterHealthCheckTaskRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListClusterHealthCheckTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterHealthCheckTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClusterHealthCheckTaskRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
