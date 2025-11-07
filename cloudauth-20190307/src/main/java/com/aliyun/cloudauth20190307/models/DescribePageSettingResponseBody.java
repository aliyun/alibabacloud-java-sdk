// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageSettingResponseBody extends TeaModel {
    /**
     * <p>Failure reasons.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *             &quot;11&quot;: &quot;认证不通过，可能原因：1、公安网照片缺失；2、公安网照片格式错误；3、公安网照片找不到人脸等可能&quot;,
     *             &quot;1&quot;: &quot;认证通过&quot;,
     *             &quot;12&quot;: &quot;认证不通过，可能原因：公安网系统异常，无法比对等可能&quot;,
     *             &quot;2&quot;: &quot;认证不通过，原因：实名校验不通过&quot;,
     *             &quot;3&quot;: &quot;认证不通过，可能原因：1、身份证照片模糊、光线问题造成字体无法识别；2、身份证照片信息与需认证的身份证姓名不一致；3、提交的照片为非身份证照片等可能&quot;,
     *             &quot;4&quot;: &quot;认证不通过，可能原因：1、身份证照片模糊、光线问题造成字体无法识别；2、身份证照片信息与需认证的身份证号码不一致；3、提交的照片为非身份证照片等可能&quot;,
     *             &quot;5&quot;: &quot;认证不通过，可能原因：身份证照片有效期已过期（或即将过期）等可能&quot;,
     *             &quot;6&quot;: &quot;认证不通过，可能原因：人脸与身份证头像不一致等可能&quot;,
     *             &quot;7&quot;: &quot;认证不通过，可能原因：人脸与公安网照片不一致等可能&quot;,
     *             &quot;8&quot;: &quot;认证不通过，可能原因：1、提交的身份证照片非身份证原照片；2、未提交有效身份证照片等可能&quot;,
     *             &quot;9&quot;: &quot;认证不通过，可能原因：非账号本人操作等可能&quot;,
     *             &quot;10&quot;: &quot;认证不通过，可能原因：非同人操作等可能&quot;
     *         }</p>
     */
    @NameInMap("FailReasons")
    public java.util.Map<String, ?> failReasons;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>C58A8581-6A5B-55F1-B2EF-1CEAC97DA181</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePageSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePageSettingResponseBody self = new DescribePageSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePageSettingResponseBody setFailReasons(java.util.Map<String, ?> failReasons) {
        this.failReasons = failReasons;
        return this;
    }
    public java.util.Map<String, ?> getFailReasons() {
        return this.failReasons;
    }

    public DescribePageSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
