// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentVoiceprintsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of voiceprints that match the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The voiceprints.</p>
     */
    @NameInMap("Voiceprints")
    public java.util.List<ListAIAgentVoiceprintsResponseBodyVoiceprints> voiceprints;

    public static ListAIAgentVoiceprintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentVoiceprintsResponseBody self = new ListAIAgentVoiceprintsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIAgentVoiceprintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIAgentVoiceprintsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAIAgentVoiceprintsResponseBody setVoiceprints(java.util.List<ListAIAgentVoiceprintsResponseBodyVoiceprints> voiceprints) {
        this.voiceprints = voiceprints;
        return this;
    }
    public java.util.List<ListAIAgentVoiceprintsResponseBodyVoiceprints> getVoiceprints() {
        return this.voiceprints;
    }

    public static class ListAIAgentVoiceprintsResponseBodyVoiceprints extends TeaModel {
        /**
         * <p>The creation time of the voiceprint.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-28T10:03:58.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time of the voiceprint.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-28T10:03:58.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The unique identifier for the voiceprint.</p>
         * 
         * <strong>example:</strong>
         * <p>vp_1699123456_8527</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        public static ListAIAgentVoiceprintsResponseBodyVoiceprints build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentVoiceprintsResponseBodyVoiceprints self = new ListAIAgentVoiceprintsResponseBodyVoiceprints();
            return TeaModel.build(map, self);
        }

        public ListAIAgentVoiceprintsResponseBodyVoiceprints setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAIAgentVoiceprintsResponseBodyVoiceprints setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAIAgentVoiceprintsResponseBodyVoiceprints setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

    }

}
