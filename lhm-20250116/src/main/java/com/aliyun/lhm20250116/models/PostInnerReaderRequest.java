// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerReaderRequest extends TeaModel {
    @NameInMap("dataSourceDescriptor")
    public PostInnerReaderRequestDataSourceDescriptor dataSourceDescriptor;

    /**
     * <strong>example:</strong>
     * <p>ds_dolphin_prod</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    public static PostInnerReaderRequest build(java.util.Map<String, ?> map) throws Exception {
        PostInnerReaderRequest self = new PostInnerReaderRequest();
        return TeaModel.build(map, self);
    }

    public PostInnerReaderRequest setDataSourceDescriptor(PostInnerReaderRequestDataSourceDescriptor dataSourceDescriptor) {
        this.dataSourceDescriptor = dataSourceDescriptor;
        return this;
    }
    public PostInnerReaderRequestDataSourceDescriptor getDataSourceDescriptor() {
        return this.dataSourceDescriptor;
    }

    public PostInnerReaderRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static class PostInnerReaderRequestDataSourceDescriptor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        @NameInMap("dsName")
        public String dsName;

        public static PostInnerReaderRequestDataSourceDescriptor build(java.util.Map<String, ?> map) throws Exception {
            PostInnerReaderRequestDataSourceDescriptor self = new PostInnerReaderRequestDataSourceDescriptor();
            return TeaModel.build(map, self);
        }

        public PostInnerReaderRequestDataSourceDescriptor setDsName(String dsName) {
            this.dsName = dsName;
            return this;
        }
        public String getDsName() {
            return this.dsName;
        }

    }

}
