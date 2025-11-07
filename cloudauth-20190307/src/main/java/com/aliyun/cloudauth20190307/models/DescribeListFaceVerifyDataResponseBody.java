// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyDataResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("MonitorData")
    public DescribeListFaceVerifyDataResponseBodyMonitorData monitorData;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>EBD373EA-07FC-50BC-906F-B8950B6ED462</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeListFaceVerifyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyDataResponseBody self = new DescribeListFaceVerifyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyDataResponseBody setMonitorData(DescribeListFaceVerifyDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeListFaceVerifyDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeListFaceVerifyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData extends TeaModel {
        /**
         * <p>Verification statistics time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16T00:00:00.000Z</p>
         */
        @NameInMap("ConDate")
        public String conDate;

        /**
         * <p>Number of failed verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("FailCnt")
        public String failCnt;

        /**
         * <p>Verification scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>Liveness</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000011644</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>Number of successful verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SuccCnt")
        public String succCnt;

        /**
         * <p>Total number of verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("TotalCnt")
        public String totalCnt;

        public static DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData self = new DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData();
            return TeaModel.build(map, self);
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setConDate(String conDate) {
            this.conDate = conDate;
            return this;
        }
        public String getConDate() {
            return this.conDate;
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setFailCnt(String failCnt) {
            this.failCnt = failCnt;
            return this;
        }
        public String getFailCnt() {
            return this.failCnt;
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setSuccCnt(String succCnt) {
            this.succCnt = succCnt;
            return this;
        }
        public String getSuccCnt() {
            return this.succCnt;
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData setTotalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public String getTotalCnt() {
            return this.totalCnt;
        }

    }

    public static class DescribeListFaceVerifyDataResponseBodyMonitorData extends TeaModel {
        /**
         * <p>Face verification data.</p>
         */
        @NameInMap("FaceVerifyData")
        public java.util.List<DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData> faceVerifyData;

        public static DescribeListFaceVerifyDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeListFaceVerifyDataResponseBodyMonitorData self = new DescribeListFaceVerifyDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeListFaceVerifyDataResponseBodyMonitorData setFaceVerifyData(java.util.List<DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData> faceVerifyData) {
            this.faceVerifyData = faceVerifyData;
            return this;
        }
        public java.util.List<DescribeListFaceVerifyDataResponseBodyMonitorDataFaceVerifyData> getFaceVerifyData() {
            return this.faceVerifyData;
        }

    }

}
