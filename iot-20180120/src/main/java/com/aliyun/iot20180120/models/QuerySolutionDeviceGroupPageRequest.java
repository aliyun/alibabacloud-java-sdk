// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectCode")
    @Validation(required = true)
    public String projectCode;

    @NameInMap("FuzzyGroupName")
    public String fuzzyGroupName;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageId")
    @Validation(required = true)
    public Integer pageId;

    public static QuerySolutionDeviceGroupPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageRequest self = new QuerySolutionDeviceGroupPageRequest();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySolutionDeviceGroupPageRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QuerySolutionDeviceGroupPageRequest setFuzzyGroupName(String fuzzyGroupName) {
        this.fuzzyGroupName = fuzzyGroupName;
        return this;
    }
    public String getFuzzyGroupName() {
        return this.fuzzyGroupName;
    }

    public QuerySolutionDeviceGroupPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySolutionDeviceGroupPageRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

}
