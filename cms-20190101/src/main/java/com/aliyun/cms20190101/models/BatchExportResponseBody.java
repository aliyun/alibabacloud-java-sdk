// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportResponseBody extends TeaModel {
    /**
     * <p>The timestamp of the data requested by the backend. A larger timestamp indicates that the data export time is closer to the current time.</p>
     */
    @NameInMap("Anchor")
    public Long anchor;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The Cursor information that is used to call this operation again.</p>
     * <br>
     * <p>>  If `null` is returned, the monitoring data is exported.</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The data returned in this call.</p>
     */
    @NameInMap("DataResults")
    public java.util.List<MetricStat> dataResults;

    /**
     * <p>Indicates whether the data has been exported. Valid values:</p>
     * <br>
     * <p>*   true: Some data is not exported.</p>
     * <p>*   false: All the data is exported.</p>
     */
    @NameInMap("HasNext")
    public Boolean hasNext;

    /**
     * <p>The number of data entries returned in this call.</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchExportResponseBody self = new BatchExportResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchExportResponseBody setAnchor(Long anchor) {
        this.anchor = anchor;
        return this;
    }
    public Long getAnchor() {
        return this.anchor;
    }

    public BatchExportResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchExportResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public BatchExportResponseBody setDataResults(java.util.List<MetricStat> dataResults) {
        this.dataResults = dataResults;
        return this;
    }
    public java.util.List<MetricStat> getDataResults() {
        return this.dataResults;
    }

    public BatchExportResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public BatchExportResponseBody setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public BatchExportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchExportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
