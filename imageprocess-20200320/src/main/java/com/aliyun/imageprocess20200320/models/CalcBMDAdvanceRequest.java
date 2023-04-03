// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcBMDAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("URLList")
    public java.util.List<CalcBMDAdvanceRequestURLList> URLList;

    public static CalcBMDAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CalcBMDAdvanceRequest self = new CalcBMDAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CalcBMDAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public CalcBMDAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CalcBMDAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CalcBMDAdvanceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CalcBMDAdvanceRequest setURLList(java.util.List<CalcBMDAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<CalcBMDAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class CalcBMDAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static CalcBMDAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            CalcBMDAdvanceRequestURLList self = new CalcBMDAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public CalcBMDAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
