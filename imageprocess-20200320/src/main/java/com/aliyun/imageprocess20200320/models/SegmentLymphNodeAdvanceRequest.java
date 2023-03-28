// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentLymphNodeAdvanceRequest extends TeaModel {
    @NameInMap("BodyPart")
    public String bodyPart;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<SegmentLymphNodeAdvanceRequestURLList> URLList;

    public static SegmentLymphNodeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentLymphNodeAdvanceRequest self = new SegmentLymphNodeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentLymphNodeAdvanceRequest setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
        return this;
    }
    public String getBodyPart() {
        return this.bodyPart;
    }

    public SegmentLymphNodeAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public SegmentLymphNodeAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public SegmentLymphNodeAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public SegmentLymphNodeAdvanceRequest setURLList(java.util.List<SegmentLymphNodeAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<SegmentLymphNodeAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class SegmentLymphNodeAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static SegmentLymphNodeAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            SegmentLymphNodeAdvanceRequestURLList self = new SegmentLymphNodeAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public SegmentLymphNodeAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
