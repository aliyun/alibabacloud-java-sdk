// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListSynonymsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;data&quot;: {
     *     &quot;data&quot;: [
     *       {
     *         &quot;gmtModified&quot;: 1734401404000,
     *         &quot;columns&quot;: [
     *           &quot;test.id&quot;,
     *           &quot;user_info.createdt&quot;
     *         ],
     *         &quot;synonymIdKey&quot;: &quot;synonyms-AAAAAAAAAVLaD8z63NnFhA&quot;,
     *         &quot;wordSynonyms&quot;: [
     *           &quot;1&quot;
     *         ],
     *         &quot;workSpaceId&quot;: &quot;10024809&quot;,
     *         &quot;gmtCreate&quot;: 1734401404000,
     *         &quot;word&quot;: &quot;1&quot;,
     *         &quot;status&quot;: 1
     *       }
     *     ],
     *     &quot;nextToken&quot;: &quot;k1BLjEN114wyfrhDHoJlbg==&quot;,
     *     &quot;totalCount&quot;: 0
     *   }
     * }</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>D02D895A-5E58-5A9F-963D-D8B027AB7AE2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListSynonymsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSynonymsResponseBody self = new ListSynonymsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSynonymsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSynonymsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSynonymsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListSynonymsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSynonymsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
