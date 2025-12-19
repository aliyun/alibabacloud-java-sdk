// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CatchAllNum")
    public String catchAllNum;

    /**
     * <strong>example:</strong>
     * <p>2000-01-01T00:00:00Z</p>
     */
    @NameInMap("CompleteTime")
    public String completeTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DoNotMailNum")
    public String doNotMailNum;

    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>file.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InvalidNum")
    public String invalidNum;

    /**
     * <strong>example:</strong>
     * <p>100%</p>
     */
    @NameInMap("Percentage")
    public String percentage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProcessedNum")
    public String processedNum;

    /**
     * <strong>example:</strong>
     * <p>yyyy-yyyy-yyyy-yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public String totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnknownNum")
    public String unknownNum;

    /**
     * <strong>example:</strong>
     * <p>2000-01-01T00:00:00Z</p>
     */
    @NameInMap("UploadTime")
    public String uploadTime;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ValidNum")
    public String validNum;

    public static GetValidateFileStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileStatusResponseBody self = new GetValidateFileStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidateFileStatusResponseBody setCatchAllNum(String catchAllNum) {
        this.catchAllNum = catchAllNum;
        return this;
    }
    public String getCatchAllNum() {
        return this.catchAllNum;
    }

    public GetValidateFileStatusResponseBody setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }
    public String getCompleteTime() {
        return this.completeTime;
    }

    public GetValidateFileStatusResponseBody setDoNotMailNum(String doNotMailNum) {
        this.doNotMailNum = doNotMailNum;
        return this;
    }
    public String getDoNotMailNum() {
        return this.doNotMailNum;
    }

    public GetValidateFileStatusResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetValidateFileStatusResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetValidateFileStatusResponseBody setInvalidNum(String invalidNum) {
        this.invalidNum = invalidNum;
        return this;
    }
    public String getInvalidNum() {
        return this.invalidNum;
    }

    public GetValidateFileStatusResponseBody setPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }
    public String getPercentage() {
        return this.percentage;
    }

    public GetValidateFileStatusResponseBody setProcessedNum(String processedNum) {
        this.processedNum = processedNum;
        return this;
    }
    public String getProcessedNum() {
        return this.processedNum;
    }

    public GetValidateFileStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetValidateFileStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetValidateFileStatusResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public GetValidateFileStatusResponseBody setUnknownNum(String unknownNum) {
        this.unknownNum = unknownNum;
        return this;
    }
    public String getUnknownNum() {
        return this.unknownNum;
    }

    public GetValidateFileStatusResponseBody setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

    public GetValidateFileStatusResponseBody setValidNum(String validNum) {
        this.validNum = validNum;
        return this;
    }
    public String getValidNum() {
        return this.validNum;
    }

}
