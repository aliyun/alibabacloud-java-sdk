// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptGetServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AdaptGetServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AdaptGetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdaptGetServiceResponseBody self = new AdaptGetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AdaptGetServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AdaptGetServiceResponseBody setData(AdaptGetServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AdaptGetServiceResponseBodyData getData() {
        return this.data;
    }

    public AdaptGetServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AdaptGetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AdaptGetServiceResponseBodyDataAdaptTarget extends TeaModel {
        @NameInMap("BitRate")
        public Integer bitRate;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("StartProgram")
        public String startProgram;

        public static AdaptGetServiceResponseBodyDataAdaptTarget build(java.util.Map<String, ?> map) throws Exception {
            AdaptGetServiceResponseBodyDataAdaptTarget self = new AdaptGetServiceResponseBodyDataAdaptTarget();
            return TeaModel.build(map, self);
        }

        public AdaptGetServiceResponseBodyDataAdaptTarget setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Integer getBitRate() {
            return this.bitRate;
        }

        public AdaptGetServiceResponseBodyDataAdaptTarget setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public AdaptGetServiceResponseBodyDataAdaptTarget setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public AdaptGetServiceResponseBodyDataAdaptTarget setStartProgram(String startProgram) {
            this.startProgram = startProgram;
            return this;
        }
        public String getStartProgram() {
            return this.startProgram;
        }

    }

    public static class AdaptGetServiceResponseBodyData extends TeaModel {
        @NameInMap("AdaptStatus")
        public String adaptStatus;

        @NameInMap("AdaptTarget")
        public AdaptGetServiceResponseBodyDataAdaptTarget adaptTarget;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TenantId")
        public Long tenantId;

        public static AdaptGetServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AdaptGetServiceResponseBodyData self = new AdaptGetServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AdaptGetServiceResponseBodyData setAdaptStatus(String adaptStatus) {
            this.adaptStatus = adaptStatus;
            return this;
        }
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        public AdaptGetServiceResponseBodyData setAdaptTarget(AdaptGetServiceResponseBodyDataAdaptTarget adaptTarget) {
            this.adaptTarget = adaptTarget;
            return this;
        }
        public AdaptGetServiceResponseBodyDataAdaptTarget getAdaptTarget() {
            return this.adaptTarget;
        }

        public AdaptGetServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AdaptGetServiceResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public AdaptGetServiceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AdaptGetServiceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AdaptGetServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AdaptGetServiceResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
