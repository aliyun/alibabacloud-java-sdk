// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppAttemptLogRequest extends TeaModel {
    /**
     * <p>The ID of the retry log.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/455887.html">ListSparkAppAttempts</a> operation to query the retry history of an application, which includes the retry log ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202207151211hz****-0001</p>
     */
    @NameInMap("AttemptId")
    public String attemptId;

    /**
     * <p>The number of lines in the retry log. Valid values: 1 to 500. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("LogLength")
    public Long logLength;

    /**
     * <p>The start offset for reading logs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of data rows per page.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static GetSparkAppAttemptLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppAttemptLogRequest self = new GetSparkAppAttemptLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppAttemptLogRequest setAttemptId(String attemptId) {
        this.attemptId = attemptId;
        return this;
    }
    public String getAttemptId() {
        return this.attemptId;
    }

    public GetSparkAppAttemptLogRequest setLogLength(Long logLength) {
        this.logLength = logLength;
        return this;
    }
    public Long getLogLength() {
        return this.logLength;
    }

    public GetSparkAppAttemptLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSparkAppAttemptLogRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
