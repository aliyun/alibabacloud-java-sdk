// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListChannelSupplierResponseBody extends TeaModel {
    @NameInMap("ChannelSupplierList")
    public java.util.List<ListChannelSupplierResponseBodyChannelSupplierList> channelSupplierList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListChannelSupplierResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChannelSupplierResponseBody self = new ListChannelSupplierResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChannelSupplierResponseBody setChannelSupplierList(java.util.List<ListChannelSupplierResponseBodyChannelSupplierList> channelSupplierList) {
        this.channelSupplierList = channelSupplierList;
        return this;
    }
    public java.util.List<ListChannelSupplierResponseBodyChannelSupplierList> getChannelSupplierList() {
        return this.channelSupplierList;
    }

    public ListChannelSupplierResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChannelSupplierResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChannelSupplierResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChannelSupplierResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChannelSupplierResponseBodyChannelSupplierList extends TeaModel {
        @NameInMap("ChannelSupplierId")
        public String channelSupplierId;

        @NameInMap("ChannelSupplierName")
        public String channelSupplierName;

        public static ListChannelSupplierResponseBodyChannelSupplierList build(java.util.Map<String, ?> map) throws Exception {
            ListChannelSupplierResponseBodyChannelSupplierList self = new ListChannelSupplierResponseBodyChannelSupplierList();
            return TeaModel.build(map, self);
        }

        public ListChannelSupplierResponseBodyChannelSupplierList setChannelSupplierId(String channelSupplierId) {
            this.channelSupplierId = channelSupplierId;
            return this;
        }
        public String getChannelSupplierId() {
            return this.channelSupplierId;
        }

        public ListChannelSupplierResponseBodyChannelSupplierList setChannelSupplierName(String channelSupplierName) {
            this.channelSupplierName = channelSupplierName;
            return this;
        }
        public String getChannelSupplierName() {
            return this.channelSupplierName;
        }

    }

}
