// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PartitionProfile> data;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("LatestAccessNumDate")
    public String latestAccessNumDate;

    /**
     * <strong>example:</strong>
     * <p>2023-08-30 19:16:10</p>
     */
    @NameInMap("LatestDate")
    public String latestDate;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>97434FA4-A6B2-1AE4-A174-76964F29C759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
