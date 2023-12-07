// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListUninstallDetailResponseBody extends TeaModel {
    /**
     * <p>msg</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>code</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public ListUninstallDetailResponseBodyData data;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListUninstallDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallDetailResponseBody self = new ListUninstallDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUninstallDetailResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListUninstallDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUninstallDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListUninstallDetailResponseBody setData(ListUninstallDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUninstallDetailResponseBodyData getData() {
        return this.data;
    }

    public ListUninstallDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUninstallDetailResponseBodyDataDetails extends TeaModel {
        @NameInMap("activeDatetime")
        public String activeDatetime;

        @NameInMap("city")
        public String city;

        /**
         * <p>deviceBrand</p>
         */
        @NameInMap("deviceBrand")
        public String deviceBrand;

        /**
         * <p>deviceModel</p>
         */
        @NameInMap("deviceModel")
        public String deviceModel;

        /**
         * <p>firstActiveDatetime</p>
         */
        @NameInMap("firstActiveDatetime")
        public String firstActiveDatetime;

        /**
         * <p>idfa</p>
         */
        @NameInMap("idfa")
        public String idfa;

        /**
         * <p>imei</p>
         */
        @NameInMap("imei")
        public String imei;

        /**
         * <p>installAppVersion</p>
         */
        @NameInMap("installAppVersion")
        public String installAppVersion;

        /**
         * <p>installChannel</p>
         */
        @NameInMap("installChannel")
        public String installChannel;

        /**
         * <p>oaid</p>
         */
        @NameInMap("oaid")
        public String oaid;

        /**
         * <p>osVersion</p>
         */
        @NameInMap("osVersion")
        public String osVersion;

        /**
         * <p>puid</p>
         */
        @NameInMap("puid")
        public String puid;

        @NameInMap("umid")
        public String umid;

        @NameInMap("uninstallCount")
        public Integer uninstallCount;

        @NameInMap("uninstallDatetime")
        public String uninstallDatetime;

        /**
         * <p>zid</p>
         */
        @NameInMap("zid")
        public String zid;

        public static ListUninstallDetailResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            ListUninstallDetailResponseBodyDataDetails self = new ListUninstallDetailResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public ListUninstallDetailResponseBodyDataDetails setActiveDatetime(String activeDatetime) {
            this.activeDatetime = activeDatetime;
            return this;
        }
        public String getActiveDatetime() {
            return this.activeDatetime;
        }

        public ListUninstallDetailResponseBodyDataDetails setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListUninstallDetailResponseBodyDataDetails setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListUninstallDetailResponseBodyDataDetails setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListUninstallDetailResponseBodyDataDetails setFirstActiveDatetime(String firstActiveDatetime) {
            this.firstActiveDatetime = firstActiveDatetime;
            return this;
        }
        public String getFirstActiveDatetime() {
            return this.firstActiveDatetime;
        }

        public ListUninstallDetailResponseBodyDataDetails setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public ListUninstallDetailResponseBodyDataDetails setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public ListUninstallDetailResponseBodyDataDetails setInstallAppVersion(String installAppVersion) {
            this.installAppVersion = installAppVersion;
            return this;
        }
        public String getInstallAppVersion() {
            return this.installAppVersion;
        }

        public ListUninstallDetailResponseBodyDataDetails setInstallChannel(String installChannel) {
            this.installChannel = installChannel;
            return this;
        }
        public String getInstallChannel() {
            return this.installChannel;
        }

        public ListUninstallDetailResponseBodyDataDetails setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public ListUninstallDetailResponseBodyDataDetails setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ListUninstallDetailResponseBodyDataDetails setPuid(String puid) {
            this.puid = puid;
            return this;
        }
        public String getPuid() {
            return this.puid;
        }

        public ListUninstallDetailResponseBodyDataDetails setUmid(String umid) {
            this.umid = umid;
            return this;
        }
        public String getUmid() {
            return this.umid;
        }

        public ListUninstallDetailResponseBodyDataDetails setUninstallCount(Integer uninstallCount) {
            this.uninstallCount = uninstallCount;
            return this;
        }
        public Integer getUninstallCount() {
            return this.uninstallCount;
        }

        public ListUninstallDetailResponseBodyDataDetails setUninstallDatetime(String uninstallDatetime) {
            this.uninstallDatetime = uninstallDatetime;
            return this;
        }
        public String getUninstallDatetime() {
            return this.uninstallDatetime;
        }

        public ListUninstallDetailResponseBodyDataDetails setZid(String zid) {
            this.zid = zid;
            return this;
        }
        public String getZid() {
            return this.zid;
        }

    }

    public static class ListUninstallDetailResponseBodyData extends TeaModel {
        @NameInMap("details")
        public java.util.List<ListUninstallDetailResponseBodyDataDetails> details;

        public static ListUninstallDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUninstallDetailResponseBodyData self = new ListUninstallDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUninstallDetailResponseBodyData setDetails(java.util.List<ListUninstallDetailResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListUninstallDetailResponseBodyDataDetails> getDetails() {
            return this.details;
        }

    }

}
