// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetDeviceListResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceListResponseBody self = new GetDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceListResponseBody setData(GetDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceListResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceListResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeviceListResponseBodyDataDeviceListInfo extends TeaModel {
        /**
         * <p>The rated capacity.</p>
         * <p>Unit is kVA.</p>
         */
        @NameInMap("constKva")
        public Integer constKva;

        /**
         * <p>The transformation ratio of current.</p>
         */
        @NameInMap("ct")
        public Integer ct;

        /**
         * <p>The magnification ratio.</p>
         */
        @NameInMap("magnification")
        public Integer magnification;

        /**
         * <p>The high and low voltage.</p>
         */
        @NameInMap("pressure")
        public Integer pressure;

        /**
         * <p>The transformation ratio of voltage.</p>
         */
        @NameInMap("pt")
        public Integer pt;

        public static GetDeviceListResponseBodyDataDeviceListInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceListResponseBodyDataDeviceListInfo self = new GetDeviceListResponseBodyDataDeviceListInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceListResponseBodyDataDeviceListInfo setConstKva(Integer constKva) {
            this.constKva = constKva;
            return this;
        }
        public Integer getConstKva() {
            return this.constKva;
        }

        public GetDeviceListResponseBodyDataDeviceListInfo setCt(Integer ct) {
            this.ct = ct;
            return this;
        }
        public Integer getCt() {
            return this.ct;
        }

        public GetDeviceListResponseBodyDataDeviceListInfo setMagnification(Integer magnification) {
            this.magnification = magnification;
            return this;
        }
        public Integer getMagnification() {
            return this.magnification;
        }

        public GetDeviceListResponseBodyDataDeviceListInfo setPressure(Integer pressure) {
            this.pressure = pressure;
            return this;
        }
        public Integer getPressure() {
            return this.pressure;
        }

        public GetDeviceListResponseBodyDataDeviceListInfo setPt(Integer pt) {
            this.pt = pt;
            return this;
        }
        public Integer getPt() {
            return this.pt;
        }

    }

    public static class GetDeviceListResponseBodyDataDeviceList extends TeaModel {
        /**
         * <p>The device ID.</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>The device name.</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <p>The level 1 meter type.</p>
         */
        @NameInMap("firstTypeName")
        public String firstTypeName;

        /**
         * <p>The device information.</p>
         */
        @NameInMap("info")
        public GetDeviceListResponseBodyDataDeviceListInfo info;

        /**
         * <p>The ID of the parent device.</p>
         */
        @NameInMap("parentDevice")
        public String parentDevice;

        /**
         * <p>The level 2 meter type.</p>
         */
        @NameInMap("secondTypeName")
        public String secondTypeName;

        public static GetDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceListResponseBodyDataDeviceList self = new GetDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public GetDeviceListResponseBodyDataDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceListResponseBodyDataDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDeviceListResponseBodyDataDeviceList setFirstTypeName(String firstTypeName) {
            this.firstTypeName = firstTypeName;
            return this;
        }
        public String getFirstTypeName() {
            return this.firstTypeName;
        }

        public GetDeviceListResponseBodyDataDeviceList setInfo(GetDeviceListResponseBodyDataDeviceListInfo info) {
            this.info = info;
            return this;
        }
        public GetDeviceListResponseBodyDataDeviceListInfo getInfo() {
            return this.info;
        }

        public GetDeviceListResponseBodyDataDeviceList setParentDevice(String parentDevice) {
            this.parentDevice = parentDevice;
            return this;
        }
        public String getParentDevice() {
            return this.parentDevice;
        }

        public GetDeviceListResponseBodyDataDeviceList setSecondTypeName(String secondTypeName) {
            this.secondTypeName = secondTypeName;
            return this;
        }
        public String getSecondTypeName() {
            return this.secondTypeName;
        }

    }

    public static class GetDeviceListResponseBodyData extends TeaModel {
        /**
         * <p>The code returned for the request.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The devices.</p>
         */
        @NameInMap("deviceList")
        public java.util.List<GetDeviceListResponseBodyDataDeviceList> deviceList;

        /**
         * <p>The ID of the site.</p>
         */
        @NameInMap("factoryId")
        public String factoryId;

        /**
         * <p>The HTTP status code.</p>
         */
        @NameInMap("httpCode")
        public Integer httpCode;

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static GetDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceListResponseBodyData self = new GetDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDeviceListResponseBodyData setDeviceList(java.util.List<GetDeviceListResponseBodyDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<GetDeviceListResponseBodyDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

        public GetDeviceListResponseBodyData setFactoryId(String factoryId) {
            this.factoryId = factoryId;
            return this;
        }
        public String getFactoryId() {
            return this.factoryId;
        }

        public GetDeviceListResponseBodyData setHttpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public Integer getHttpCode() {
            return this.httpCode;
        }

        public GetDeviceListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
