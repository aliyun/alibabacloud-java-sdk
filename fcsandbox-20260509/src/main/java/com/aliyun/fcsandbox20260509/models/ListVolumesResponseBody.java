// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ListVolumesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>qxGrXje86XMrYQ51aJMy</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("volumes")
    public java.util.List<E2BVolume> volumes;

    public static ListVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVolumesResponseBody self = new ListVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVolumesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVolumesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVolumesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVolumesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVolumesResponseBody setVolumes(java.util.List<E2BVolume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<E2BVolume> getVolumes() {
        return this.volumes;
    }

}
