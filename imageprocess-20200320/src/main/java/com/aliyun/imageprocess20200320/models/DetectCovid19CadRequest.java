// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("URLList")
    public java.util.List<DetectCovid19CadRequestURLList> URLList;

    public static DetectCovid19CadRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadRequest self = new DetectCovid19CadRequest();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectCovid19CadRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectCovid19CadRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectCovid19CadRequest setURLList(java.util.List<DetectCovid19CadRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectCovid19CadRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectCovid19CadRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static DetectCovid19CadRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadRequestURLList self = new DetectCovid19CadRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
