// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<CalcCACSAdvanceRequestURLList> URLList;

    public static CalcCACSAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSAdvanceRequest self = new CalcCACSAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CalcCACSAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public CalcCACSAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CalcCACSAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CalcCACSAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CalcCACSAdvanceRequest setURLList(java.util.List<CalcCACSAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<CalcCACSAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class CalcCACSAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static CalcCACSAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSAdvanceRequestURLList self = new CalcCACSAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public CalcCACSAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
