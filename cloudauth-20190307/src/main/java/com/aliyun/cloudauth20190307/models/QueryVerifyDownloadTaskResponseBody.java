// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the download task is complete. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Complete.</li>
     * <li><strong>false</strong>: Not complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Finish")
    public Boolean finish;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The file is being generated.</li>
     * <li><strong>2</strong>: The file is generated.</li>
     * <li><strong>3</strong>: The file failed to be generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The download URL.</p>
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
