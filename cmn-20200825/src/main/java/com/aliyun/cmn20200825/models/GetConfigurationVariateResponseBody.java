// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationVariateResponseBody extends TeaModel {
    // 资源对象
    @NameInMap("ConfigurationVariate")
    public GetConfigurationVariateResponseBodyConfigurationVariate configurationVariate;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigurationVariateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationVariateResponseBody self = new GetConfigurationVariateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigurationVariateResponseBody setConfigurationVariate(GetConfigurationVariateResponseBodyConfigurationVariate configurationVariate) {
        this.configurationVariate = configurationVariate;
        return this;
    }
    public GetConfigurationVariateResponseBodyConfigurationVariate getConfigurationVariate() {
        return this.configurationVariate;
    }

    public GetConfigurationVariateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigurationVariateResponseBodyConfigurationVariate extends TeaModel {
        // 变量描述
        @NameInMap("Comment")
        public String comment;

        // 转换函数
        @NameInMap("FormatFunction")
        public String formatFunction;

        // project
        @NameInMap("VariateName")
        public String variateName;

        public static GetConfigurationVariateResponseBodyConfigurationVariate build(java.util.Map<String, ?> map) throws Exception {
            GetConfigurationVariateResponseBodyConfigurationVariate self = new GetConfigurationVariateResponseBodyConfigurationVariate();
            return TeaModel.build(map, self);
        }

        public GetConfigurationVariateResponseBodyConfigurationVariate setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetConfigurationVariateResponseBodyConfigurationVariate setFormatFunction(String formatFunction) {
            this.formatFunction = formatFunction;
            return this;
        }
        public String getFormatFunction() {
            return this.formatFunction;
        }

        public GetConfigurationVariateResponseBodyConfigurationVariate setVariateName(String variateName) {
            this.variateName = variateName;
            return this;
        }
        public String getVariateName() {
            return this.variateName;
        }

    }

}
