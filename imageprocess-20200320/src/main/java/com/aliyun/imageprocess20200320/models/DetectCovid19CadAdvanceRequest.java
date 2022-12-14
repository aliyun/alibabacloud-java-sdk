// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<DetectCovid19CadAdvanceRequestURLList> URLList;

    public static DetectCovid19CadAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadAdvanceRequest self = new DetectCovid19CadAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectCovid19CadAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectCovid19CadAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectCovid19CadAdvanceRequest setURLList(java.util.List<DetectCovid19CadAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectCovid19CadAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectCovid19CadAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectCovid19CadAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadAdvanceRequestURLList self = new DetectCovid19CadAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
