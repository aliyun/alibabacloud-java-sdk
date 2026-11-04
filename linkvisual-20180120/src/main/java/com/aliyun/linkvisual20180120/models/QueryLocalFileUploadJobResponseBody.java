// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLocalFileUploadJobResponseBody extends TeaModel {
    /**
     * <p>The response code:</p>
     * <ul>
     * <li><strong>200</strong>: The call is successful.</li>
     * <li>Other values: An error occurred. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public QueryLocalFileUploadJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant auth error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>449ECE75-A36A-4ACE-B253-147C78C440C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryLocalFileUploadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalFileUploadJobResponseBody self = new QueryLocalFileUploadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLocalFileUploadJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLocalFileUploadJobResponseBody setData(QueryLocalFileUploadJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLocalFileUploadJobResponseBodyData getData() {
        return this.data;
    }

    public QueryLocalFileUploadJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLocalFileUploadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLocalFileUploadJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLocalFileUploadJobResponseBodyDataResultListFileList extends TeaModel {
        /**
         * <p>The end time of the video recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>1634746054</p>
         */
        @NameInMap("FileEndTime")
        public Integer fileEndTime;

        /**
         * <p>The name of the video recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The start time of the video recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>1634747054</p>
         */
        @NameInMap("FileStartTime")
        public Integer fileStartTime;

        public static QueryLocalFileUploadJobResponseBodyDataResultListFileList build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyDataResultListFileList self = new QueryLocalFileUploadJobResponseBodyDataResultListFileList();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileEndTime(Integer fileEndTime) {
            this.fileEndTime = fileEndTime;
            return this;
        }
        public Integer getFileEndTime() {
            return this.fileEndTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultListFileList setFileStartTime(Integer fileStartTime) {
            this.fileStartTime = fileStartTime;
            return this;
        }
        public Integer getFileStartTime() {
            return this.fileStartTime;
        }

    }

    public static class QueryLocalFileUploadJobResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The status code of the video recording upload task. Valid values:</p>
         * <ul>
         * <li>200: Normal.</li>
         * <li>9201: The device is offline. Bring the device online and try again.</li>
         * <li>9409: No cloud storage quota is available. Check the cloud storage quota and try again.</li>
         * <li>9417: A device, network, or other exception occurred. Try again, or check the device and network status.</li>
         * <li>9435: The video recording file does not exist. Make sure that the video recording file is stored locally on the video device and try again.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9201</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The DeviceName of the video device.</p>
         * 
         * <strong>example:</strong>
         * <p>gb_hik_IPC</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The list of video recording files.</p>
         */
        @NameInMap("FileList")
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> fileList;

        /**
         * <p>The ID of the video device. The ID is issued by IoT Platform and uniquely identifies the device.</p>
         * 
         * <strong>example:</strong>
         * <p>IQ9mO4tvMnAj****QUdcg2n400</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ProductKey of the product to which the video device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>g2****Q6ggK</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The end time of the video recording upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>1634746054</p>
         */
        @NameInMap("SlotEndTime")
        public Integer slotEndTime;

        /**
         * <p>The start time of the video recording upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>1634745754</p>
         */
        @NameInMap("SlotStartTime")
        public Integer slotStartTime;

        /**
         * <p>The execution status of the video recording upload task within the time period specified by <strong>SlotStartTime</strong> and <strong>SlotEndTime</strong>. Valid values:</p>
         * <ul>
         * <li>0: The task is being initialized.</li>
         * <li>1: The task is running.</li>
         * <li>2: The task is completed.</li>
         * <li>3: An exception occurred during task execution.</li>
         * <li>4: The task is manually terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SlotStatus")
        public Integer slotStatus;

        public static QueryLocalFileUploadJobResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyDataResultList self = new QueryLocalFileUploadJobResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setFileList(java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultListFileList> getFileList() {
            return this.fileList;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotEndTime(Integer slotEndTime) {
            this.slotEndTime = slotEndTime;
            return this;
        }
        public Integer getSlotEndTime() {
            return this.slotEndTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotStartTime(Integer slotStartTime) {
            this.slotStartTime = slotStartTime;
            return this;
        }
        public Integer getSlotStartTime() {
            return this.slotStartTime;
        }

        public QueryLocalFileUploadJobResponseBodyDataResultList setSlotStatus(Integer slotStatus) {
            this.slotStatus = slotStatus;
            return this;
        }
        public Integer getSlotStatus() {
            return this.slotStatus;
        }

    }

    public static class QueryLocalFileUploadJobResponseBodyData extends TeaModel {
        /**
         * <p>The task list.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> resultList;

        /**
         * <p>The status of the video recording upload task. Valid values:</p>
         * <ul>
         * <li>0: The task is being initialized.</li>
         * <li>1: The task is running.</li>
         * <li>2: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static QueryLocalFileUploadJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLocalFileUploadJobResponseBodyData self = new QueryLocalFileUploadJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLocalFileUploadJobResponseBodyData setResultList(java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<QueryLocalFileUploadJobResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public QueryLocalFileUploadJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
