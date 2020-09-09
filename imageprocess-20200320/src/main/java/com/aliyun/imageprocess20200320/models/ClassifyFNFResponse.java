// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ClassifyFNFResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ClassifyFNFResponseData data;

    public static ClassifyFNFResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyFNFResponse self = new ClassifyFNFResponse();
        return TeaModel.build(map, self);
    }

    public ClassifyFNFResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClassifyFNFResponse setData(ClassifyFNFResponseData data) {
        this.data = data;
        return this;
    }
    public ClassifyFNFResponseData getData() {
        return this.data;
    }

    public static class ClassifyFNFResponseDataFracturesTag extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static ClassifyFNFResponseDataFracturesTag build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseDataFracturesTag self = new ClassifyFNFResponseDataFracturesTag();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseDataFracturesTag setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ClassifyFNFResponseDataFractures extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        @NameInMap("Tag")
        @Validation(required = true)
        public ClassifyFNFResponseDataFracturesTag tag;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static ClassifyFNFResponseDataFractures build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseDataFractures self = new ClassifyFNFResponseDataFractures();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseDataFractures setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ClassifyFNFResponseDataFractures setTag(ClassifyFNFResponseDataFracturesTag tag) {
            this.tag = tag;
            return this;
        }
        public ClassifyFNFResponseDataFracturesTag getTag() {
            return this.tag;
        }

        public ClassifyFNFResponseDataFractures setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

    }

    public static class ClassifyFNFResponseData extends TeaModel {
        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("OrgId")
        @Validation(required = true)
        public String orgId;

        @NameInMap("OrgName")
        @Validation(required = true)
        public String orgName;

        @NameInMap("Fractures")
        @Validation(required = true)
        public java.util.List<ClassifyFNFResponseDataFractures> fractures;

        public static ClassifyFNFResponseData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyFNFResponseData self = new ClassifyFNFResponseData();
            return TeaModel.build(map, self);
        }

        public ClassifyFNFResponseData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ClassifyFNFResponseData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ClassifyFNFResponseData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public ClassifyFNFResponseData setFractures(java.util.List<ClassifyFNFResponseDataFractures> fractures) {
            this.fractures = fractures;
            return this;
        }
        public java.util.List<ClassifyFNFResponseDataFractures> getFractures() {
            return this.fractures;
        }

    }

}
