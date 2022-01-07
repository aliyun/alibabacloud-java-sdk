// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageRequest extends TeaModel {
    @NameInMap("FuzzyGroupName")
    public String fuzzyGroupName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectCode")
    public String projectCode;

    public static QuerySolutionDeviceGroupPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageRequest self = new QuerySolutionDeviceGroupPageRequest();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageRequest setFuzzyGroupName(String fuzzyGroupName) {
        this.fuzzyGroupName = fuzzyGroupName;
        return this;
    }
    public String getFuzzyGroupName() {
        return this.fuzzyGroupName;
    }

    public QuerySolutionDeviceGroupPageRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySolutionDeviceGroupPageRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySolutionDeviceGroupPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySolutionDeviceGroupPageRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

}
