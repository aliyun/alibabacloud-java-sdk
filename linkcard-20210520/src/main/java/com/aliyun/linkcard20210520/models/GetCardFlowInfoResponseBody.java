// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardFlowInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCardFlowInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCardFlowInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardFlowInfoResponseBody self = new GetCardFlowInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardFlowInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardFlowInfoResponseBody setData(GetCardFlowInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCardFlowInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCardFlowInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCardFlowInfoResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetCardFlowInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardFlowInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow extends TeaModel {
        @NameInMap("Day")
        public String day;

        @NameInMap("Flow")
        public String flow;

        public static GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow build(java.util.Map<String, ?> map) throws Exception {
            GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow self = new GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow();
            return TeaModel.build(map, self);
        }

        public GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

    }

    public static class GetCardFlowInfoResponseBodyDataListCardMonthFlow extends TeaModel {
        @NameInMap("FlowCount")
        public String flowCount;

        @NameInMap("ListDayFlow")
        public java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow> listDayFlow;

        @NameInMap("Month")
        public String month;

        public static GetCardFlowInfoResponseBodyDataListCardMonthFlow build(java.util.Map<String, ?> map) throws Exception {
            GetCardFlowInfoResponseBodyDataListCardMonthFlow self = new GetCardFlowInfoResponseBodyDataListCardMonthFlow();
            return TeaModel.build(map, self);
        }

        public GetCardFlowInfoResponseBodyDataListCardMonthFlow setFlowCount(String flowCount) {
            this.flowCount = flowCount;
            return this;
        }
        public String getFlowCount() {
            return this.flowCount;
        }

        public GetCardFlowInfoResponseBodyDataListCardMonthFlow setListDayFlow(java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow> listDayFlow) {
            this.listDayFlow = listDayFlow;
            return this;
        }
        public java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlowListDayFlow> getListDayFlow() {
            return this.listDayFlow;
        }

        public GetCardFlowInfoResponseBodyDataListCardMonthFlow setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

    }

    public static class GetCardFlowInfoResponseBodyDataListPackageDTO extends TeaModel {
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("Remark")
        public String remark;

        public static GetCardFlowInfoResponseBodyDataListPackageDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardFlowInfoResponseBodyDataListPackageDTO self = new GetCardFlowInfoResponseBodyDataListPackageDTO();
            return TeaModel.build(map, self);
        }

        public GetCardFlowInfoResponseBodyDataListPackageDTO setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public GetCardFlowInfoResponseBodyDataListPackageDTO setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetCardFlowInfoResponseBodyDataListPackageDTO setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetCardFlowInfoResponseBodyDataListPackageDTO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class GetCardFlowInfoResponseBodyDataListVendorDetail extends TeaModel {
        @NameInMap("NetWorkDelay")
        public String netWorkDelay;

        @NameInMap("SignalStrength")
        public String signalStrength;

        @NameInMap("Vendor")
        public String vendor;

        public static GetCardFlowInfoResponseBodyDataListVendorDetail build(java.util.Map<String, ?> map) throws Exception {
            GetCardFlowInfoResponseBodyDataListVendorDetail self = new GetCardFlowInfoResponseBodyDataListVendorDetail();
            return TeaModel.build(map, self);
        }

        public GetCardFlowInfoResponseBodyDataListVendorDetail setNetWorkDelay(String netWorkDelay) {
            this.netWorkDelay = netWorkDelay;
            return this;
        }
        public String getNetWorkDelay() {
            return this.netWorkDelay;
        }

        public GetCardFlowInfoResponseBodyDataListVendorDetail setSignalStrength(String signalStrength) {
            this.signalStrength = signalStrength;
            return this;
        }
        public String getSignalStrength() {
            return this.signalStrength;
        }

        public GetCardFlowInfoResponseBodyDataListVendorDetail setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class GetCardFlowInfoResponseBodyData extends TeaModel {
        @NameInMap("ListCardMonthFlow")
        public java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlow> listCardMonthFlow;

        @NameInMap("ListPackageDTO")
        public java.util.List<GetCardFlowInfoResponseBodyDataListPackageDTO> listPackageDTO;

        @NameInMap("ListVendorDetail")
        public java.util.List<GetCardFlowInfoResponseBodyDataListVendorDetail> listVendorDetail;

        public static GetCardFlowInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardFlowInfoResponseBodyData self = new GetCardFlowInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardFlowInfoResponseBodyData setListCardMonthFlow(java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlow> listCardMonthFlow) {
            this.listCardMonthFlow = listCardMonthFlow;
            return this;
        }
        public java.util.List<GetCardFlowInfoResponseBodyDataListCardMonthFlow> getListCardMonthFlow() {
            return this.listCardMonthFlow;
        }

        public GetCardFlowInfoResponseBodyData setListPackageDTO(java.util.List<GetCardFlowInfoResponseBodyDataListPackageDTO> listPackageDTO) {
            this.listPackageDTO = listPackageDTO;
            return this;
        }
        public java.util.List<GetCardFlowInfoResponseBodyDataListPackageDTO> getListPackageDTO() {
            return this.listPackageDTO;
        }

        public GetCardFlowInfoResponseBodyData setListVendorDetail(java.util.List<GetCardFlowInfoResponseBodyDataListVendorDetail> listVendorDetail) {
            this.listVendorDetail = listVendorDetail;
            return this;
        }
        public java.util.List<GetCardFlowInfoResponseBodyDataListVendorDetail> getListVendorDetail() {
            return this.listVendorDetail;
        }

    }

}
