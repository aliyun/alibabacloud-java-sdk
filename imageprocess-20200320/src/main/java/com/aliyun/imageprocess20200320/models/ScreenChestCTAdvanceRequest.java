// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("Mask")
    public Long mask;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenChestCTAdvanceRequestURLList> URLList;

    @NameInMap("Verbose")
    public Long verbose;

    public static ScreenChestCTAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTAdvanceRequest self = new ScreenChestCTAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenChestCTAdvanceRequest setMask(Long mask) {
        this.mask = mask;
        return this;
    }
    public Long getMask() {
        return this.mask;
    }

    public ScreenChestCTAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenChestCTAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenChestCTAdvanceRequest setURLList(java.util.List<ScreenChestCTAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenChestCTAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public ScreenChestCTAdvanceRequest setVerbose(Long verbose) {
        this.verbose = verbose;
        return this;
    }
    public Long getVerbose() {
        return this.verbose;
    }

    public static class ScreenChestCTAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenChestCTAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTAdvanceRequestURLList self = new ScreenChestCTAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
