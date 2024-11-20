// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartVoiceGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>627B30EB-1D0A-5C6D-8467-431626E0FA10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried speaker groups.</p>
     */
    @NameInMap("VoiceGroups")
    public java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroups> voiceGroups;

    public static ListSmartVoiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartVoiceGroupsResponseBody self = new ListSmartVoiceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartVoiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartVoiceGroupsResponseBody setVoiceGroups(java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroups> voiceGroups) {
        this.voiceGroups = voiceGroups;
        return this;
    }
    public java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroups> getVoiceGroups() {
        return this.voiceGroups;
    }

    public static class ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList extends TeaModel {
        /**
         * <p>The speaker description.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The speaker name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The remarks of the speaker.</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("SupportSampleRate")
        public String supportSampleRate;

        /**
         * <p>The tag of the speaker type.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The speaker ID.</p>
         * 
         * <strong>example:</strong>
         * <p>zhitian</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The speaker type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Male</li>
         * <li>Female</li>
         * <li>Boy</li>
         * <li>Girl</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Female</p>
         */
        @NameInMap("VoiceType")
        public String voiceType;

        /**
         * <p>The URL of the sample audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.com/zhiqing.mp3</p>
         */
        @NameInMap("VoiceUrl")
        public String voiceUrl;

        public static ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList build(java.util.Map<String, ?> map) throws Exception {
            ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList self = new ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList();
            return TeaModel.build(map, self);
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setSupportSampleRate(String supportSampleRate) {
            this.supportSampleRate = supportSampleRate;
            return this;
        }
        public String getSupportSampleRate() {
            return this.supportSampleRate;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setVoiceType(String voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public String getVoiceType() {
            return this.voiceType;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList setVoiceUrl(String voiceUrl) {
            this.voiceUrl = voiceUrl;
            return this;
        }
        public String getVoiceUrl() {
            return this.voiceUrl;
        }

    }

    public static class ListSmartVoiceGroupsResponseBodyVoiceGroups extends TeaModel {
        /**
         * <p>The name of the speaker group.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The speakers.</p>
         */
        @NameInMap("VoiceList")
        public java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList> voiceList;

        public static ListSmartVoiceGroupsResponseBodyVoiceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListSmartVoiceGroupsResponseBodyVoiceGroups self = new ListSmartVoiceGroupsResponseBodyVoiceGroups();
            return TeaModel.build(map, self);
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSmartVoiceGroupsResponseBodyVoiceGroups setVoiceList(java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList> voiceList) {
            this.voiceList = voiceList;
            return this;
        }
        public java.util.List<ListSmartVoiceGroupsResponseBodyVoiceGroupsVoiceList> getVoiceList() {
            return this.voiceList;
        }

    }

}
