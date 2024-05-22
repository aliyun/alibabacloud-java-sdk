// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaMarksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaMarks")
    public String mediaMarks;

    public static AddMediaMarksRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaMarksRequest self = new AddMediaMarksRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaMarksRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public AddMediaMarksRequest setMediaMarks(String mediaMarks) {
        this.mediaMarks = mediaMarks;
        return this;
    }
    public String getMediaMarks() {
        return this.mediaMarks;
    }

}
