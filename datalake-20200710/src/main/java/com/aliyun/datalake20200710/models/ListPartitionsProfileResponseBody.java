// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PartitionProfile> data;

    @NameInMap("LatestAccessNumDate")
    public String latestAccessNumDate;

    @NameInMap("LatestDate")
    public String latestDate;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListPartitionsProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsProfileResponseBody self = new ListPartitionsProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartitionsProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPartitionsProfileResponseBody setData(java.util.List<PartitionProfile> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PartitionProfile> getData() {
        return this.data;
    }

    public ListPartitionsProfileResponseBody setLatestAccessNumDate(String latestAccessNumDate) {
        this.latestAccessNumDate = latestAccessNumDate;
        return this;
    }
    public String getLatestAccessNumDate() {
        return this.latestAccessNumDate;
    }

    public ListPartitionsProfileResponseBody setLatestDate(String latestDate) {
        this.latestDate = latestDate;
        return this;
    }
    public String getLatestDate() {
        return this.latestDate;
    }

    public ListPartitionsProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPartitionsProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPartitionsProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPartitionsProfileResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
