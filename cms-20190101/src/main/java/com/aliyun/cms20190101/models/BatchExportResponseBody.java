// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportResponseBody extends TeaModel {
    @NameInMap("Anchor")
    public Long anchor;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("DataResults")
    public java.util.List<MetricStat> dataResults;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
