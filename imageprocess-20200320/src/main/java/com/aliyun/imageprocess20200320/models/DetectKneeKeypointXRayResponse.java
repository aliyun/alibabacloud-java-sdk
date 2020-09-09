// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeKeypointXRayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectKneeKeypointXRayResponseData data;

    public static DetectKneeKeypointXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeKeypointXRayResponse self = new DetectKneeKeypointXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectKneeKeypointXRayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectKneeKeypointXRayResponse setData(DetectKneeKeypointXRayResponseData data) {
        this.data = data;
        return this;
    }
    public DetectKneeKeypointXRayResponseData getData() {
        return this.data;
    }

    public static class DetectKneeKeypointXRayResponseDataKeyPointsTag extends TeaModel {
        @NameInMap("Direction")
        @Validation(required = true)
        public String direction;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static DetectKneeKeypointXRayResponseDataKeyPointsTag build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseDataKeyPointsTag self = new DetectKneeKeypointXRayResponseDataKeyPointsTag();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseDataKeyPointsTag setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DetectKneeKeypointXRayResponseDataKeyPointsTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DetectKneeKeypointXRayResponseDataKeyPoints extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        @NameInMap("Tag")
        @Validation(required = true)
        public DetectKneeKeypointXRayResponseDataKeyPointsTag tag;

        @NameInMap("Coordinates")
        @Validation(required = true)
        public java.util.List<Integer> coordinates;

        public static DetectKneeKeypointXRayResponseDataKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseDataKeyPoints self = new DetectKneeKeypointXRayResponseDataKeyPoints();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseDataKeyPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectKneeKeypointXRayResponseDataKeyPoints setTag(DetectKneeKeypointXRayResponseDataKeyPointsTag tag) {
            this.tag = tag;
            return this;
        }
        public DetectKneeKeypointXRayResponseDataKeyPointsTag getTag() {
            return this.tag;
        }

        public DetectKneeKeypointXRayResponseDataKeyPoints setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

    }

    public static class DetectKneeKeypointXRayResponseData extends TeaModel {
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
        public java.util.List<DetectKneeKeypointXRayResponseDataKeyPoints> keyPoints;

        public static DetectKneeKeypointXRayResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseData self = new DetectKneeKeypointXRayResponseData();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DetectKneeKeypointXRayResponseData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DetectKneeKeypointXRayResponseData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public DetectKneeKeypointXRayResponseData setKeyPoints(java.util.List<DetectKneeKeypointXRayResponseDataKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<DetectKneeKeypointXRayResponseDataKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

    }

}
