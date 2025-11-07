// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Whether the download task is completed:</p>
     * <ul>
     * <li><strong>true</strong>: Completed</li>
     * <li><strong>false</strong>: Not completed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Finish")
    public Boolean finish;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task status:</p>
     * <ul>
     * <li><strong>1</strong>: File generation in progress</li>
     * <li><strong>2</strong>: File generation completed</li>
     * <li><strong>3</strong>: File generation failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Download URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.csv">http://xxx/xxx.csv</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static QueryVerifyDownloadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyDownloadTaskResponseBody self = new QueryVerifyDownloadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVerifyDownloadTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryVerifyDownloadTaskResponseBody setFinish(Boolean finish) {
        this.finish = finish;
        return this;
    }
    public Boolean getFinish() {
        return this.finish;
    }

    public QueryVerifyDownloadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVerifyDownloadTaskResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryVerifyDownloadTaskResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
