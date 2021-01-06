// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ClassifyFNFResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ClassifyFNFResponseBodyData data;

    public static ClassifyFNFResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClassifyFNFResponseBody self = new ClassifyFNFResponseBody();
        return TeaModel.build(map, self);
    }

    public ClassifyFNFResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClassifyFNFResponseBody setData(ClassifyFNFResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClassifyFNFResponseBodyData getData() {
        return this.data;
    }

    public static class ClassifyFNFResponseBodyDataFracturesTag extends TeaModel {
        @NameInMap("Label")
        public String label;

        public static ClassifyFNFResponseBodyDataFracturesTag build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseBodyDataFracturesTag self = new ClassifyFNFResponseBodyDataFracturesTag();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseBodyDataFracturesTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ClassifyFNFResponseBodyDataFractures extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Tag")
        public ClassifyFNFResponseBodyDataFracturesTag tag;

        public static ClassifyFNFResponseBodyDataFractures build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseBodyDataFractures self = new ClassifyFNFResponseBodyDataFractures();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseBodyDataFractures setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ClassifyFNFResponseBodyDataFractures setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public ClassifyFNFResponseBodyDataFractures setTag(ClassifyFNFResponseBodyDataFracturesTag tag) {
            this.tag = tag;
            return this;
        }
        public ClassifyFNFResponseBodyDataFracturesTag getTag() {
            return this.tag;
        }

    }

    public static class ClassifyFNFResponseBodyData extends TeaModel {
        @NameInMap("Fractures")
        public java.util.List<ClassifyFNFResponseBodyDataFractures> fractures;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OrgName")
        public String orgName;

        public static ClassifyFNFResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseBodyData self = new ClassifyFNFResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseBodyData setFractures(java.util.List<ClassifyFNFResponseBodyDataFractures> fractures) {
            this.fractures = fractures;
            return this;
        }
        public java.util.List<ClassifyFNFResponseBodyDataFractures> getFractures() {
            return this.fractures;
        }

        public ClassifyFNFResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ClassifyFNFResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ClassifyFNFResponseBodyData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

}
