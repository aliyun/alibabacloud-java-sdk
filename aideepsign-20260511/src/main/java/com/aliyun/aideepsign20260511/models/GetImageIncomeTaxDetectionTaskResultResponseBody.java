// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageIncomeTaxDetectionTaskResultResponseBody extends TeaModel {
    /**
     * <p><strong>The business error code.</strong> The value &quot;OK&quot; is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p><strong>The HTTP status code.</strong> The value 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p><strong>The list of detected abnormal items.</strong> Returned only when <code>Status</code> is <code>succeeded</code>. An empty array indicates that no abnormal items are detected.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItems> items;

    /**
     * <p>The failure reason when the task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>poll timeout: no result within 30m0s</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The raw downstream detection result (extend.result string) for troubleshooting and passing through new fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;items&quot;: []}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p><strong>The task status.</strong> Valid values: <code>running</code> (in progress), <code>succeeded</code> (completed), <code>failed</code> (failed).</p>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p><strong>The task ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageIncomeTaxDetectionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageIncomeTaxDetectionTaskResultResponseBody self = new GetImageIncomeTaxDetectionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setItems(java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItems> getItems() {
        return this.items;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageIncomeTaxDetectionTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates extends TeaModel {
        /**
         * <p>The X-coordinate of the upper-left corner (pixels).</p>
         * 
         * <strong>example:</strong>
         * <p>928</p>
         */
        @NameInMap("X1")
        public Integer x1;

        /**
         * <p>The X-coordinate of the lower-right corner of the bounding box (pixels).</p>
         * 
         * <strong>example:</strong>
         * <p>1147</p>
         */
        @NameInMap("X2")
        public Integer x2;

        /**
         * <p>The Y-coordinate of the upper-left corner (pixels).</p>
         * 
         * <strong>example:</strong>
         * <p>792</p>
         */
        @NameInMap("Y1")
        public Integer y1;

        /**
         * <p>The Y-coordinate of the lower-right corner of the bounding box (pixels).</p>
         * 
         * <strong>example:</strong>
         * <p>847</p>
         */
        @NameInMap("Y2")
        public Integer y2;

        public static GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates build(java.util.Map<String, ?> map) throws Exception {
            GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates self = new GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates();
            return TeaModel.build(map, self);
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates setX1(Integer x1) {
            this.x1 = x1;
            return this;
        }
        public Integer getX1() {
            return this.x1;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates setX2(Integer x2) {
            this.x2 = x2;
            return this;
        }
        public Integer getX2() {
            return this.x2;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates setY1(Integer y1) {
            this.y1 = y1;
            return this;
        }
        public Integer getY1() {
            return this.y1;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates setY2(Integer y2) {
            this.y2 = y2;
            return this;
        }
        public Integer getY2() {
            return this.y2;
        }

    }

    public static class GetImageIncomeTaxDetectionTaskResultResponseBodyItems extends TeaModel {
        /**
         * <p>The text description of the abnormal item.</p>
         * 
         * <strong>example:</strong>
         * <p>Month sequence anomaly: 2022-05 -&gt; 2022-11 (should be in descending or equal order)</p>
         */
        @NameInMap("AbnormalItem")
        public String abnormalItem;

        /**
         * <p>The bounding box position of the abnormal item in the image. May be an empty array for image-wide abnormalities.</p>
         */
        @NameInMap("Coordinates")
        public java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates> coordinates;

        /**
         * <p>The detection stage identifier for the abnormality.</p>
         * 
         * <strong>example:</strong>
         * <p>stage2</p>
         */
        @NameInMap("Stage")
        public String stage;

        public static GetImageIncomeTaxDetectionTaskResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetImageIncomeTaxDetectionTaskResultResponseBodyItems self = new GetImageIncomeTaxDetectionTaskResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItems setAbnormalItem(String abnormalItem) {
            this.abnormalItem = abnormalItem;
            return this;
        }
        public String getAbnormalItem() {
            return this.abnormalItem;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItems setCoordinates(java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<GetImageIncomeTaxDetectionTaskResultResponseBodyItemsCoordinates> getCoordinates() {
            return this.coordinates;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBodyItems setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

}
