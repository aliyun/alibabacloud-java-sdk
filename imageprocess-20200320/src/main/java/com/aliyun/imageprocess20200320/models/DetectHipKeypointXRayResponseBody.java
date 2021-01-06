// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectHipKeypointXRayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectHipKeypointXRayResponseBodyData data;

    public static DetectHipKeypointXRayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectHipKeypointXRayResponseBody self = new DetectHipKeypointXRayResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectHipKeypointXRayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectHipKeypointXRayResponseBody setData(DetectHipKeypointXRayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectHipKeypointXRayResponseBodyData getData() {
        return this.data;
    }

    public static class DetectHipKeypointXRayResponseBodyDataKeyPointsTag extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("Label")
        public String label;

        public static DetectHipKeypointXRayResponseBodyDataKeyPointsTag build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseBodyDataKeyPointsTag self = new DetectHipKeypointXRayResponseBodyDataKeyPointsTag();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseBodyDataKeyPointsTag setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DetectHipKeypointXRayResponseBodyDataKeyPointsTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DetectHipKeypointXRayResponseBodyDataKeyPoints extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("Coordinates")
        public java.util.List<Integer> coordinates;

        @NameInMap("Tag")
        public DetectHipKeypointXRayResponseBodyDataKeyPointsTag tag;

        public static DetectHipKeypointXRayResponseBodyDataKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseBodyDataKeyPoints self = new DetectHipKeypointXRayResponseBodyDataKeyPoints();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseBodyDataKeyPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectHipKeypointXRayResponseBodyDataKeyPoints setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

        public DetectHipKeypointXRayResponseBodyDataKeyPoints setTag(DetectHipKeypointXRayResponseBodyDataKeyPointsTag tag) {
            this.tag = tag;
            return this;
        }
        public DetectHipKeypointXRayResponseBodyDataKeyPointsTag getTag() {
            return this.tag;
        }

    }

    public static class DetectHipKeypointXRayResponseBodyData extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<DetectHipKeypointXRayResponseBodyDataKeyPoints> keyPoints;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OrgName")
        public String orgName;

        public static DetectHipKeypointXRayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseBodyData self = new DetectHipKeypointXRayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseBodyData setKeyPoints(java.util.List<DetectHipKeypointXRayResponseBodyDataKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<DetectHipKeypointXRayResponseBodyDataKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public DetectHipKeypointXRayResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DetectHipKeypointXRayResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DetectHipKeypointXRayResponseBodyData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

}
