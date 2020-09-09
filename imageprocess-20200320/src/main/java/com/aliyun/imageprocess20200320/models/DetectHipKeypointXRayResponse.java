// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectHipKeypointXRayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectHipKeypointXRayResponseData data;

    public static DetectHipKeypointXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectHipKeypointXRayResponse self = new DetectHipKeypointXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectHipKeypointXRayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectHipKeypointXRayResponse setData(DetectHipKeypointXRayResponseData data) {
        this.data = data;
        return this;
    }
    public DetectHipKeypointXRayResponseData getData() {
        return this.data;
    }

    public static class DetectHipKeypointXRayResponseDataKeyPointsTag extends TeaModel {
        @NameInMap("Direction")
        @Validation(required = true)
        public String direction;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static DetectHipKeypointXRayResponseDataKeyPointsTag build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseDataKeyPointsTag self = new DetectHipKeypointXRayResponseDataKeyPointsTag();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseDataKeyPointsTag setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DetectHipKeypointXRayResponseDataKeyPointsTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DetectHipKeypointXRayResponseDataKeyPoints extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        @NameInMap("Tag")
        @Validation(required = true)
        public DetectHipKeypointXRayResponseDataKeyPointsTag tag;

        @NameInMap("Coordinates")
        @Validation(required = true)
        public java.util.List<Integer> coordinates;

        public static DetectHipKeypointXRayResponseDataKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseDataKeyPoints self = new DetectHipKeypointXRayResponseDataKeyPoints();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseDataKeyPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectHipKeypointXRayResponseDataKeyPoints setTag(DetectHipKeypointXRayResponseDataKeyPointsTag tag) {
            this.tag = tag;
            return this;
        }
        public DetectHipKeypointXRayResponseDataKeyPointsTag getTag() {
            return this.tag;
        }

        public DetectHipKeypointXRayResponseDataKeyPoints setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

    }

    public static class DetectHipKeypointXRayResponseData extends TeaModel {
        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("OrgId")
        @Validation(required = true)
        public String orgId;

        @NameInMap("OrgName")
        @Validation(required = true)
        public String orgName;

        @NameInMap("KeyPoints")
        @Validation(required = true)
        public java.util.List<DetectHipKeypointXRayResponseDataKeyPoints> keyPoints;

        public static DetectHipKeypointXRayResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectHipKeypointXRayResponseData self = new DetectHipKeypointXRayResponseData();
            return TeaModel.build(map, self);
        }

        public DetectHipKeypointXRayResponseData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DetectHipKeypointXRayResponseData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DetectHipKeypointXRayResponseData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public DetectHipKeypointXRayResponseData setKeyPoints(java.util.List<DetectHipKeypointXRayResponseDataKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<DetectHipKeypointXRayResponseDataKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

    }

}
