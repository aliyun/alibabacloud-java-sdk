// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaMarksRequest extends TeaModel {
    /**
     * <p>The ID of the media asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53afdf003a******6a16b5feac6402</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The marks of the media asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *  {
     *  &quot;MarkStartTime&quot;: &quot;12.1&quot;,
     *  &quot;MarkEndTime&quot;: &quot;12.2&quot;,
     *  &quot;MarkTag&quot;: &quot;tag-1&quot;,
     *  &quot;MarkContent&quot;: &quot;content-1&quot;,
     *  &quot;MarkStatus&quot;: &quot;a&quot;
     *  },
     *  {
     *  &quot;MarkStartTime&quot;: &quot;12.3&quot;,
     *  &quot;MarkEndTime&quot;: &quot;12.4&quot;,
     *  &quot;MarkTag&quot;: &quot;tag-2&quot;,
     *  &quot;MarkContent&quot;: &quot;content-2&quot;,
     *  &quot;MarkStatus&quot;: &quot;online&quot;
     *  }
     * ]</p>
     */
    @NameInMap("MediaMarks")
    public String mediaMarks;

    public static UpdateMediaMarksRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaMarksRequest self = new UpdateMediaMarksRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaMarksRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaMarksRequest setMediaMarks(String mediaMarks) {
        this.mediaMarks = mediaMarks;
        return this;
    }
    public String getMediaMarks() {
        return this.mediaMarks;
    }

}
