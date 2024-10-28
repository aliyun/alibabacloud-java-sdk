// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class RecognizeAudioResponseBody extends TeaModel {
    @NameInMap("ItemList")
    public java.util.List<RecognizeAudioResponseBodyItemList> itemList;

    /**
     * <strong>example:</strong>
     * <p>38CD0881-BC7B-5ADB-A3EB-FF813927D09A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3ab5c082-2c0e-4f39-b12f-057dd5e373ff</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RecognizeAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAudioResponseBody self = new RecognizeAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeAudioResponseBody setItemList(java.util.List<RecognizeAudioResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<RecognizeAudioResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public RecognizeAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeAudioResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RecognizeAudioResponseBodyItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>1230</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>How are you</p>
         */
        @NameInMap("Text")
        public String text;

        public static RecognizeAudioResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAudioResponseBodyItemList self = new RecognizeAudioResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public RecognizeAudioResponseBodyItemList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public RecognizeAudioResponseBodyItemList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public RecognizeAudioResponseBodyItemList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
