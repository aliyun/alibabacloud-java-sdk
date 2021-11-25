// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExternalID")
    public String externalID;

    @NameInMap("FailDetail")
    public GetOfficeConversionTaskResponseBodyFailDetail failDetail;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("ImageSpec")
    public String imageSpec;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Percent")
    public Integer percent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SrcUri")
    public String srcUri;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TgtType")
    public String tgtType;

    @NameInMap("TgtUri")
    public String tgtUri;

    public static GetOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeConversionTaskResponseBody self = new GetOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfficeConversionTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOfficeConversionTaskResponseBody setExternalID(String externalID) {
        this.externalID = externalID;
        return this;
    }
    public String getExternalID() {
        return this.externalID;
    }

    public GetOfficeConversionTaskResponseBody setFailDetail(GetOfficeConversionTaskResponseBodyFailDetail failDetail) {
        this.failDetail = failDetail;
        return this;
    }
    public GetOfficeConversionTaskResponseBodyFailDetail getFailDetail() {
        return this.failDetail;
    }

    public GetOfficeConversionTaskResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetOfficeConversionTaskResponseBody setImageSpec(String imageSpec) {
        this.imageSpec = imageSpec;
        return this;
    }
    public String getImageSpec() {
        return this.imageSpec;
    }

    public GetOfficeConversionTaskResponseBody setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetOfficeConversionTaskResponseBody setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetOfficeConversionTaskResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public GetOfficeConversionTaskResponseBody setPercent(Integer percent) {
        this.percent = percent;
        return this;
    }
    public Integer getPercent() {
        return this.percent;
    }

    public GetOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfficeConversionTaskResponseBody setSrcUri(String srcUri) {
        this.srcUri = srcUri;
        return this;
    }
    public String getSrcUri() {
        return this.srcUri;
    }

    public GetOfficeConversionTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetOfficeConversionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetOfficeConversionTaskResponseBody setTgtType(String tgtType) {
        this.tgtType = tgtType;
        return this;
    }
    public String getTgtType() {
        return this.tgtType;
    }

    public GetOfficeConversionTaskResponseBody setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public static class GetOfficeConversionTaskResponseBodyFailDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static GetOfficeConversionTaskResponseBodyFailDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOfficeConversionTaskResponseBodyFailDetail self = new GetOfficeConversionTaskResponseBodyFailDetail();
            return TeaModel.build(map, self);
        }

        public GetOfficeConversionTaskResponseBodyFailDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
