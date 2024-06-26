// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaMarksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53afdf003a******6a16b5feac6402</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>This parameter is required.</p>
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
