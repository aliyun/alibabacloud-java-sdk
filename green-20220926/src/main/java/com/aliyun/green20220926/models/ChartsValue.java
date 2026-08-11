// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ChartsValue extends TeaModel {
    /**
     * <p>The X-axis.</p>
     */
    @NameInMap("X")
    public java.util.List<String> x;

    /**
     * <p>The Y-axis.</p>
     */
    @NameInMap("Y")
    public java.util.List<ChartsValueY> y;

    public static ChartsValue build(java.util.Map<String, ?> map) throws Exception {
        ChartsValue self = new ChartsValue();
        return TeaModel.build(map, self);
    }

    public ChartsValue setX(java.util.List<String> x) {
        this.x = x;
        return this;
    }
    public java.util.List<String> getX() {
        return this.x;
    }

    public ChartsValue setY(java.util.List<ChartsValueY> y) {
        this.y = y;
        return this;
    }
    public java.util.List<ChartsValueY> getY() {
        return this.y;
    }

    public static class ChartsValueY extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The QPS at the point in time.</p>
         */
        @NameInMap("Data")
        public java.util.List<Long> data;

        public static ChartsValueY build(java.util.Map<String, ?> map) throws Exception {
            ChartsValueY self = new ChartsValueY();
            return TeaModel.build(map, self);
        }

        public ChartsValueY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChartsValueY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

    }

}
