// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainStagingConfigResponseBody extends TeaModel {
    /**
     * <p>You can set multiple records for some features, such as the edge_function feature. To update a record, you can set the ConfigId (Long type) field to specify the configuration items that you want to modify. Syntax: </p>
     * <br>
     * <p>```</p>
     * <p>[{"functionArgs":[{"argName":"enable","argValue":"on"},{"argName":"pri","argValue":"1"},{"argName":"rule","argValue":"yyy"}],"ConfigId":123456,"functionName":"edge_function"}]</p>
     * <p>```</p>
     * <p>**Description**All parameter values are of the string type.</p>
     * <br>
     * <p>| Feature | Parameter |</p>
     * <p>| ------- | --------- |</p>
     * <p>| edge_function: EdgeScript functions | Required parameters:</p>
     * <br>
     * <p>rule: the domain-specific language (DSL) script.</p>
     * <br>
     * <p>pri: the priority of the script.</p>
     * <br>
     * <p>enable: specifies whether to enable the script. Valid values: on and off.</p>
     * <br>
     * <p> Optional parameters:</p>
     * <br>
     * <p>name: the name of the script.</p>
     * <br>
     * <p>pos: specifies whether to execute the script at the start or end of the request processing pipeline. For the accelerated domain names of Dynamic Route for CDN (DCDN), only the value of head is supported. The value of foot is not supported. </p>
     * <br>
     * <p>brk: After the script is matched, the subsequent scripts at the specified position are skipped. </p>
     * <br>
     * <p>option: option control.</p>
     * <br>
     * <p>grammar: grammar control. Valid values: null, es2, and js.</p>
     * <br>
     * <p>jsmode: control of the JavaScript domain name whitelist. Valid values: redirect and bypass. |</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainStagingConfigResponseBody self = new SetDcdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
