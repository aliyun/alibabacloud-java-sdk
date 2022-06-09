// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("Mask")
    public Long mask;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenChestCTRequestURLList> URLList;

    @NameInMap("Verbose")
    public Long verbose;

    public static ScreenChestCTRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTRequest self = new ScreenChestCTRequest();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenChestCTRequest setMask(Long mask) {
        this.mask = mask;
        return this;
    }
    public Long getMask() {
        return this.mask;
    }

    public ScreenChestCTRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenChestCTRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenChestCTRequest setURLList(java.util.List<ScreenChestCTRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenChestCTRequestURLList> getURLList() {
        return this.URLList;
    }

    public ScreenChestCTRequest setVerbose(Long verbose) {
        this.verbose = verbose;
        return this;
    }
    public Long getVerbose() {
        return this.verbose;
    }

    public static class ScreenChestCTRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static ScreenChestCTRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTRequestURLList self = new ScreenChestCTRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
