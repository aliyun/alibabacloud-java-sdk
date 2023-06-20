// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchUpdateStoreTextDataRequest extends TeaModel {
    @NameInMap("StoreTextData")
    public java.util.List<BatchUpdateStoreTextDataRequestStoreTextData> storeTextData;

    @NameInMap("country")
    public String country;

    public static BatchUpdateStoreTextDataRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateStoreTextDataRequest self = new BatchUpdateStoreTextDataRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateStoreTextDataRequest setStoreTextData(java.util.List<BatchUpdateStoreTextDataRequestStoreTextData> storeTextData) {
        this.storeTextData = storeTextData;
        return this;
    }
    public java.util.List<BatchUpdateStoreTextDataRequestStoreTextData> getStoreTextData() {
        return this.storeTextData;
    }

    public BatchUpdateStoreTextDataRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public static class BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData extends TeaModel {
        @NameInMap("Bold")
        public Integer bold;

        @NameInMap("Color")
        public String color;

        @NameInMap("Mark")
        public String mark;

        @NameInMap("SubText")
        public String subText;

        @NameInMap("Text")
        public String text;

        public static BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData self = new BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData();
            return TeaModel.build(map, self);
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData setBold(Integer bold) {
            this.bold = bold;
            return this;
        }
        public Integer getBold() {
            return this.bold;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData setMark(String mark) {
            this.mark = mark;
            return this;
        }
        public String getMark() {
            return this.mark;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData setSubText(String subText) {
            this.subText = subText;
            return this;
        }
        public String getSubText() {
            return this.subText;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class BatchUpdateStoreTextDataRequestStoreTextDataContainers extends TeaModel {
        @NameInMap("ContainerData")
        public java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData> containerData;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Visible")
        public Integer visible;

        public static BatchUpdateStoreTextDataRequestStoreTextDataContainers build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateStoreTextDataRequestStoreTextDataContainers self = new BatchUpdateStoreTextDataRequestStoreTextDataContainers();
            return TeaModel.build(map, self);
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainers setContainerData(java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData> containerData) {
            this.containerData = containerData;
            return this;
        }
        public java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainersContainerData> getContainerData() {
            return this.containerData;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainers setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchUpdateStoreTextDataRequestStoreTextDataContainers setVisible(Integer visible) {
            this.visible = visible;
            return this;
        }
        public Integer getVisible() {
            return this.visible;
        }

    }

    public static class BatchUpdateStoreTextDataRequestStoreTextData extends TeaModel {
        @NameInMap("Containers")
        public java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainers> containers;

        @NameInMap("StoreId")
        public String storeId;

        public static BatchUpdateStoreTextDataRequestStoreTextData build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateStoreTextDataRequestStoreTextData self = new BatchUpdateStoreTextDataRequestStoreTextData();
            return TeaModel.build(map, self);
        }

        public BatchUpdateStoreTextDataRequestStoreTextData setContainers(java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<BatchUpdateStoreTextDataRequestStoreTextDataContainers> getContainers() {
            return this.containers;
        }

        public BatchUpdateStoreTextDataRequestStoreTextData setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

    }

}
