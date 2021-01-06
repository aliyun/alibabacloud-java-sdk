// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeKeypointXRayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectKneeKeypointXRayResponseBodyData data;

    public static DetectKneeKeypointXRayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeKeypointXRayResponseBody self = new DetectKneeKeypointXRayResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectKneeKeypointXRayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectKneeKeypointXRayResponseBody setData(DetectKneeKeypointXRayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectKneeKeypointXRayResponseBodyData getData() {
        return this.data;
    }

    public static class DetectKneeKeypointXRayResponseBodyDataKeyPointsTag extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("Label")
        public String label;

        public static DetectKneeKeypointXRayResponseBodyDataKeyPointsTag build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseBodyDataKeyPointsTag self = new DetectKneeKeypointXRayResponseBodyDataKeyPointsTag();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseBodyDataKeyPointsTag setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DetectKneeKeypointXRayResponseBodyDataKeyPointsTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DetectKneeKeypointXRayResponseBodyDataKeyPoints extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("Coordinates")
        public java.util.List<Integer> coordinates;

        @NameInMap("Tag")
        public DetectKneeKeypointXRayResponseBodyDataKeyPointsTag tag;

        public static DetectKneeKeypointXRayResponseBodyDataKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseBodyDataKeyPoints self = new DetectKneeKeypointXRayResponseBodyDataKeyPoints();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseBodyDataKeyPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectKneeKeypointXRayResponseBodyDataKeyPoints setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

        public DetectKneeKeypointXRayResponseBodyDataKeyPoints setTag(DetectKneeKeypointXRayResponseBodyDataKeyPointsTag tag) {
            this.tag = tag;
            return this;
        }
        public DetectKneeKeypointXRayResponseBodyDataKeyPointsTag getTag() {
            return this.tag;
        }

    }

    public static class DetectKneeKeypointXRayResponseBodyData extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<DetectKneeKeypointXRayResponseBodyDataKeyPoints> keyPoints;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OrgName")
        public String orgName;

        public static DetectKneeKeypointXRayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeKeypointXRayResponseBodyData self = new DetectKneeKeypointXRayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectKneeKeypointXRayResponseBodyData setKeyPoints(java.util.List<DetectKneeKeypointXRayResponseBodyDataKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<DetectKneeKeypointXRayResponseBodyDataKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public DetectKneeKeypointXRayResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DetectKneeKeypointXRayResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DetectKneeKeypointXRayResponseBodyData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

}
