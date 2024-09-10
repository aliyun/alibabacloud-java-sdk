// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportResponseBody extends TeaModel {
    /**
     * <p>The timestamp of the data requested by the backend. A larger timestamp indicates that the data export time is closer to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1678781819000</p>
     */
    @NameInMap("Anchor")
    public Long anchor;

    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The Cursor information that is used to call this operation again.</p>
     * <blockquote>
     * <p> If <code>null</code> is returned, the monitoring data is exported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v2.5eyJidWNrZXRzIjo0LCJjdXJzb3IiOiIxNjQxNDU0ODAwMDAwMWUxY2YxNWY0NTU0MTliZjllYTY4OWQ2ODI1OTU1Yzc1NmZjMDQ2OTMxMzczMzM2MzUzMTMxMzEzMzM0MzMzODM5MzEzMTMwMjQyYzY5MmQzMjdhNjU2MjY3N2E2NjZhNzczOTY2NmM3Mjc0NjM3MzY5Njg3NDcyMjQyYyIsImN1cnNvclZlcnNpb24iOiJxdWVyeSIsImVuZFRpbWUiOjE2NDE0NTUyMzYxMTIsImV4cG9ydEVuZFRpbWUiOjE2NDE0NTUyMzYxMTIsImV4cG9ydFN0YXJ0VGltZSI6MTY0MTQ1NDYzNjExMiwiZXhwcmVzc1JhbmdlIjpmYWxzZSwiaGFzTmV4dCI6dHJ1ZSwiaW5wdXRNZXRyaWMiOiJDUFVVdGlsaXphdGlvbiIsImlucHV0TmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJsaW1pdCI6MTAwMCwibG9nVGltZU1vZGUiOnRydWUsIm1hdGNoZXJzIjp7ImNoYWluIjpbeyJsYWJlbCI6InVzZXJJZCIsIm9wZXJhdG9yIjoiRVFVQUxTIiwidmFsdWUiOiIxNzM2NTExMTM0Mzg5MTEwIn1dfSwibWV0cmljIjoiQ1BVVXRpbGl6YXRpb24iLCJtZXRyaWNUeXBlIjoiTUVUUklDIiwibmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJuZXh0UGtBZGFwdGVyIjp7fSwib2Zmc2V0IjowLCJwYXJlbnRVaWQiOjEyNzA2NzY2Nzk1NDY3MDQsInN0YXJ0VGltZSI6MTY0MTQ1NDYzNjExMiwic3RlcCI6LTEsInRpbWVvdXQiOjEyMCwid2luZG93Ijo2MH0***</p>
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
     * <ul>
     * <li>true: Some data is not exported.</li>
     * <li>false: All the data is exported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasNext")
    public Boolean hasNext;

    /**
     * <p>The number of data entries returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>251402CD-305C-1617-808E-D8C11FC8138D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
