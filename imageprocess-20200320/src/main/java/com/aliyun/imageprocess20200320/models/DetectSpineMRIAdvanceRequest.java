// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSpineMRIAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<DetectSpineMRIAdvanceRequestURLList> URLList;

    public static DetectSpineMRIAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectSpineMRIAdvanceRequest self = new DetectSpineMRIAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectSpineMRIAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectSpineMRIAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectSpineMRIAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectSpineMRIAdvanceRequest setURLList(java.util.List<DetectSpineMRIAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectSpineMRIAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectSpineMRIAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectSpineMRIAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIAdvanceRequestURLList self = new DetectSpineMRIAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
