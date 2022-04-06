// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSpineMRIRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<DetectSpineMRIRequestURLList> URLList;

    public static DetectSpineMRIRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectSpineMRIRequest self = new DetectSpineMRIRequest();
        return TeaModel.build(map, self);
    }

    public DetectSpineMRIRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectSpineMRIRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectSpineMRIRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectSpineMRIRequest setURLList(java.util.List<DetectSpineMRIRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectSpineMRIRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectSpineMRIRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static DetectSpineMRIRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIRequestURLList self = new DetectSpineMRIRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
