// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteMapsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListErRouteMapsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListErRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErRouteMapsResponseBody self = new ListErRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErRouteMapsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListErRouteMapsResponseBody setContent(ListErRouteMapsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListErRouteMapsResponseBodyContent getContent() {
        return this.content;
    }

    public ListErRouteMapsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListErRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListErRouteMapsResponseBodyContentData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Message")
        public String message;

        @NameInMap("ReceptionInstanceId")
        public String receptionInstanceId;

        @NameInMap("ReceptionInstanceName")
        public String receptionInstanceName;

        @NameInMap("ReceptionInstanceOwner")
        public String receptionInstanceOwner;

        @NameInMap("ReceptionInstanceType")
        public String receptionInstanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMapNum")
        public Integer routeMapNum;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TransmissionInstanceId")
        public String transmissionInstanceId;

        @NameInMap("TransmissionInstanceName")
        public String transmissionInstanceName;

        @NameInMap("TransmissionInstanceOwner")
        public String transmissionInstanceOwner;

        @NameInMap("TransmissionInstanceType")
        public String transmissionInstanceType;

        public static ListErRouteMapsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteMapsResponseBodyContentData self = new ListErRouteMapsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListErRouteMapsResponseBodyContentData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListErRouteMapsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListErRouteMapsResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListErRouteMapsResponseBodyContentData setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListErRouteMapsResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListErRouteMapsResponseBodyContentData setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        public ListErRouteMapsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListErRouteMapsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceId(String receptionInstanceId) {
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }
        public String getReceptionInstanceId() {
            return this.receptionInstanceId;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceName(String receptionInstanceName) {
            this.receptionInstanceName = receptionInstanceName;
            return this;
        }
        public String getReceptionInstanceName() {
            return this.receptionInstanceName;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceOwner(String receptionInstanceOwner) {
            this.receptionInstanceOwner = receptionInstanceOwner;
            return this;
        }
        public String getReceptionInstanceOwner() {
            return this.receptionInstanceOwner;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceType(String receptionInstanceType) {
            this.receptionInstanceType = receptionInstanceType;
            return this;
        }
        public String getReceptionInstanceType() {
            return this.receptionInstanceType;
        }

        public ListErRouteMapsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListErRouteMapsResponseBodyContentData setRouteMapNum(Integer routeMapNum) {
            this.routeMapNum = routeMapNum;
            return this;
        }
        public Integer getRouteMapNum() {
            return this.routeMapNum;
        }

        public ListErRouteMapsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListErRouteMapsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceId(String transmissionInstanceId) {
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }
        public String getTransmissionInstanceId() {
            return this.transmissionInstanceId;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceName(String transmissionInstanceName) {
            this.transmissionInstanceName = transmissionInstanceName;
            return this;
        }
        public String getTransmissionInstanceName() {
            return this.transmissionInstanceName;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceOwner(String transmissionInstanceOwner) {
            this.transmissionInstanceOwner = transmissionInstanceOwner;
            return this;
        }
        public String getTransmissionInstanceOwner() {
            return this.transmissionInstanceOwner;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceType(String transmissionInstanceType) {
            this.transmissionInstanceType = transmissionInstanceType;
            return this;
        }
        public String getTransmissionInstanceType() {
            return this.transmissionInstanceType;
        }

    }

    public static class ListErRouteMapsResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListErRouteMapsResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListErRouteMapsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteMapsResponseBodyContent self = new ListErRouteMapsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListErRouteMapsResponseBodyContent setData(java.util.List<ListErRouteMapsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListErRouteMapsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListErRouteMapsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
