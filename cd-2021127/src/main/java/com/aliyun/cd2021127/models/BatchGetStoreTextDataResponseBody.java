// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchGetStoreTextDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchGetStoreTextDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetStoreTextDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetStoreTextDataResponseBody self = new BatchGetStoreTextDataResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetStoreTextDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetStoreTextDataResponseBody setData(java.util.List<BatchGetStoreTextDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchGetStoreTextDataResponseBodyData> getData() {
        return this.data;
    }

    public BatchGetStoreTextDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchGetStoreTextDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGetStoreTextDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetStoreTextDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetStoreTextDataResponseBodyDataContainersContainerData extends TeaModel {
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

        public static BatchGetStoreTextDataResponseBodyDataContainersContainerData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetStoreTextDataResponseBodyDataContainersContainerData self = new BatchGetStoreTextDataResponseBodyDataContainersContainerData();
            return TeaModel.build(map, self);
        }

        public BatchGetStoreTextDataResponseBodyDataContainersContainerData setBold(Integer bold) {
            this.bold = bold;
            return this;
        }
        public Integer getBold() {
            return this.bold;
        }

        public BatchGetStoreTextDataResponseBodyDataContainersContainerData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public BatchGetStoreTextDataResponseBodyDataContainersContainerData setMark(String mark) {
            this.mark = mark;
            return this;
        }
        public String getMark() {
            return this.mark;
        }

        public BatchGetStoreTextDataResponseBodyDataContainersContainerData setSubText(String subText) {
            this.subText = subText;
            return this;
        }
        public String getSubText() {
            return this.subText;
        }

        public BatchGetStoreTextDataResponseBodyDataContainersContainerData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class BatchGetStoreTextDataResponseBodyDataContainers extends TeaModel {
        @NameInMap("ContainerData")
        public java.util.List<BatchGetStoreTextDataResponseBodyDataContainersContainerData> containerData;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Visible")
        public Integer visible;

        public static BatchGetStoreTextDataResponseBodyDataContainers build(java.util.Map<String, ?> map) throws Exception {
            BatchGetStoreTextDataResponseBodyDataContainers self = new BatchGetStoreTextDataResponseBodyDataContainers();
            return TeaModel.build(map, self);
        }

        public BatchGetStoreTextDataResponseBodyDataContainers setContainerData(java.util.List<BatchGetStoreTextDataResponseBodyDataContainersContainerData> containerData) {
            this.containerData = containerData;
            return this;
        }
        public java.util.List<BatchGetStoreTextDataResponseBodyDataContainersContainerData> getContainerData() {
            return this.containerData;
        }

        public BatchGetStoreTextDataResponseBodyDataContainers setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchGetStoreTextDataResponseBodyDataContainers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchGetStoreTextDataResponseBodyDataContainers setVisible(Integer visible) {
            this.visible = visible;
            return this;
        }
        public Integer getVisible() {
            return this.visible;
        }

    }

    public static class BatchGetStoreTextDataResponseBodyData extends TeaModel {
        @NameInMap("Containers")
        public java.util.List<BatchGetStoreTextDataResponseBodyDataContainers> containers;

        @NameInMap("StoreId")
        public String storeId;

        public static BatchGetStoreTextDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetStoreTextDataResponseBodyData self = new BatchGetStoreTextDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGetStoreTextDataResponseBodyData setContainers(java.util.List<BatchGetStoreTextDataResponseBodyDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<BatchGetStoreTextDataResponseBodyDataContainers> getContainers() {
            return this.containers;
        }

        public BatchGetStoreTextDataResponseBodyData setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

    }

}
