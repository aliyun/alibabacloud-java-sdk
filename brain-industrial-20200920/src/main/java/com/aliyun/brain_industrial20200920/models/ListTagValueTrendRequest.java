// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListTagValueTrendRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidTag")
    @Validation(required = true)
    public java.util.List<ListTagValueTrendRequestPidTag> pidTag;

    public static ListTagValueTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagValueTrendRequest self = new ListTagValueTrendRequest();
        return TeaModel.build(map, self);
    }

    public ListTagValueTrendRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public ListTagValueTrendRequest setPidTag(java.util.List<ListTagValueTrendRequestPidTag> pidTag) {
        this.pidTag = pidTag;
        return this;
    }
    public java.util.List<ListTagValueTrendRequestPidTag> getPidTag() {
        return this.pidTag;
    }

    public static class ListTagValueTrendRequestPidTag extends TeaModel {
        @NameInMap("PidTagId")
        @Validation(required = true)
        public String pidTagId;

        public static ListTagValueTrendRequestPidTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagValueTrendRequestPidTag self = new ListTagValueTrendRequestPidTag();
            return TeaModel.build(map, self);
        }

        public ListTagValueTrendRequestPidTag setPidTagId(String pidTagId) {
            this.pidTagId = pidTagId;
            return this;
        }
        public String getPidTagId() {
            return this.pidTagId;
        }

    }

}
